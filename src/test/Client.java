package test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client extends javax.swing.JFrame {

	public Client() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {
		this.setLocation(500, 100);

		jButton1 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("Connect to ");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jTextField1.setText("localhost");
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setEditable(false);
		jScrollPane1.setViewportView(jTextArea1);

		jButton2.setText("Send Message");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING,
												false)
												.addComponent(
														jButton2,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE)
												.addComponent(
														jButton1,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														Short.MAX_VALUE))
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField2)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.Alignment.TRAILING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														257, Short.MAX_VALUE)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.Alignment.TRAILING))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton1)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										215,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap(17, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws IOException, IOException {
		ip = jTextField1.getText();
		s = new Socket(ip, 9000);
		jTextArea1.append("System:Connecting to " + ip + "\n");
		in = new BufferedReader(new InputStreamReader(s.getInputStream()));
		out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				s.getOutputStream())), true);
		msg = new Socket(ip, 9001);
		inmsg = new BufferedReader(new InputStreamReader(msg.getInputStream()));
		outmsg = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				msg.getOutputStream())), true);
		fs = new Socket(ip, 9002);
		fin = new BufferedReader(new InputStreamReader(fs.getInputStream()));
		fout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				fs.getOutputStream())), true);
		ts = new Socket(ip, 9004);
		tin = new BufferedReader(new InputStreamReader(ts.getInputStream()));
		tout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
				ts.getOutputStream())), true);
		cmt = new msgthread(msg, inmsg, jTextArea1);
		cmt.start();
		ct = new cthread(s, in, out);
		ct.start();
		fct = new fcthread(fs, fin, fout,fm);
		fct.start();
		tct = new tcthread(ts, tin, tout);
		tct.start();
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		cmsg = jTextField2.getText();
		jTextArea1.append("Client:" + cmsg + "\n");
		jTextField2.setText("");
		outmsg.println("Client:" + cmsg);
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Server.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Server.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Server.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Server.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new Client().setVisible(true);

			}
		});

	}
	
	private tcthread tct ;
	private FileManage fm = new FileManage(new File(""));
	private fcthread fct;
	private cthread ct;
	private msgthread cmt;
	private String ip;
	private String cmsg;
	private String smsg;
	private Socket ts;
	private BufferedReader tin;
	private PrintWriter tout;
	private Socket fs;
	private BufferedReader fin;
	private PrintWriter fout;
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;
	private Socket msg;
	private BufferedReader inmsg;
	private PrintWriter outmsg;

	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;

}

class msgthread extends Thread {
	private Socket msg;
	private BufferedReader inmsg;
	private javax.swing.JTextArea jTextArea1;

	msgthread(Socket msg, BufferedReader inmsg, javax.swing.JTextArea jTextArea1) {
		this.inmsg = inmsg;
		this.msg = msg;
		this.jTextArea1 = jTextArea1;
	}

	public void run() {
		while (true) {
			String smsg = null;
			try {
				smsg = inmsg.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			jTextArea1.append(smsg + "\n");
		}
	}
}

class cthread extends Thread {
	private Socket s;
	private BufferedReader in;
	private PrintWriter out;

	cthread(Socket s, BufferedReader in, PrintWriter out) {
		this.in = in;
		this.s = s;
		this.out = out;
	}

	public void run() {
		while (true) {
			String scmd = null;
			try {
				scmd = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("scmd:" + scmd);
			if (scmd.equalsIgnoreCase("ip")) {
				IpHandler ip = new IpHandler();
				String hip = null;
				System.out.println("111111");
				try {
					hip = ip.getHostIp();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("ip:" + hip);

				out.println("Client: My IP is " + hip);
			} else if (scmd.equalsIgnoreCase("time")) {
				TimeTrans timet = new TimeTrans();
				String time = timet.getTime();
				out.println("Client: My TIME is " + time);
			} else if (scmd.substring(0, 3).equalsIgnoreCase("s 1")) {
				String time = scmd.substring(4);
				System.out.println("ssss11111:" + time);
				int t = Integer.parseInt(time);
				ShutDown s = new ShutDown();
				s.shutdown(t);
				out.println("Client: Computer will be down in " + time + "s");
			} else if (scmd.substring(0, 3).equalsIgnoreCase("s 2")) {
				ShutDown s = new ShutDown();
				s.cancleshutdown();
				out.println("Client: Shutdown is cancelled!");
			} else if (scmd.substring(0, 3).equalsIgnoreCase("s 3")) {
				String time = scmd.substring(4);
				int t = Integer.parseInt(time);
				ShutDown s = new ShutDown();
				s.restart(t);
				out.println("Client: Computer will be restarted in " + time
						+ "s");
			} else if (scmd.substring(0, 3).equalsIgnoreCase("s 4")) {
				ShutDown s = new ShutDown();
				s.sleep();
				out.println("Client: Computer is sleeping.ZZzzzz");
			}
		}
	}
}

class fcthread extends Thread {
	private Socket fs;
	private BufferedReader fin;
	private PrintWriter fout;
	private FileManage fm;

	fcthread(Socket fs, BufferedReader fin, PrintWriter fout, FileManage fm) {
		this.fin = fin;
		this.fs = fs;
		this.fout = fout;
		this.fm = fm;
	}

	public void run() {
		while (true) {
			String fstream = null;
			try {
				fstream = fin.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 1")) {
				File present = new File(fstream.substring(4));
				fm = new FileManage(present);
				String child = null;
				if (fm.ifexist() == 0) {
					child = "f 9 " + present.getPath();
				} else if (fm.iffolder() == 0) {
					child = "f 0 " + present.getName();
				} else {
					child = "f 1 " + fm.printChild();
				}
				fout.println(child);
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 7")) {
				System.out.println("present:" + fm.getPresent());
				System.out.println("fstream:" + fstream);
				File present = new File(fm.getPresent() + fstream.substring(4));
				String child = null;
				if (!present.exists()) {
					child = "f 9 " + present.getPath();
				} else if (!present.isDirectory()) {
					child = "f 0 " + present.getName();
				} else {
					fm.setPresent(present);
					child = "f 1 " + fm.printChild();
				}
				fout.println(child);
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 2")) {
				String oadd = "";
				String nadd = "";
				int flag = 0;
				for (int i = 4; i < fstream.length(); i++) {
					char o = fstream.charAt(i);
					if (o == '^') {
						flag = 1;
					} else if (flag == 0) {
						oadd = oadd + String.valueOf(o);
					} else if (flag == 1) {
						nadd = nadd + String.valueOf(o);
					}
				}
				File newf = new File(nadd);
				File oldf = new File(oadd);
				if (!oldf.exists()) {
					fout.println("System:OldFile does not exist!");
				} else if (newf.exists()) {
					fout.println("System:NewFile has allready exist!");
				} else {
					fout.println("System:Start to Remove!");
					fm.removeFile(nadd, oadd);
					fout.println("System:Remove finished!");
				}
				System.out.println("nadd:" + nadd + " \noadd:" + oadd);		
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 6")) {
				String oadd = "";
				String nadd = "";
				int flag = 0;
				for (int i = 4; i < fstream.length(); i++) {
					char o = fstream.charAt(i);
					if (o == '^') {
						flag = 1;
					} else if (flag == 0) {
						oadd = oadd + String.valueOf(o);
					} else if (flag == 1) {
						nadd = nadd + String.valueOf(o);
					}
				}
				File newf = new File(nadd);
				File oldf = new File(oadd);
				if (!oldf.exists()) {
					fout.println("System:OldFile does not exist!");
				} else if (newf.exists()) {
					fout.println("System:NewFile has allready exist!");
				} else {
					fout.println("System:Start to Copy!");
					fm.copyFile(nadd, oadd);
					fout.println("System:Copy finished!");
				}
				System.out.println("nadd:" + nadd + " \noadd:" + oadd);		
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 3")) {
				String fadd = fstream.substring(4);
				File delf = new File(fadd);
				if (!delf.exists()) {
					fout.println("System:File does not exist!");
				}else {
					fout.println("System:Start to Delete!");
					fm.delFile(fadd);
					fout.println("System:Delete finished!");
				}		
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 4")) {
				String fadd = fstream.substring(4);
				File runf = new File(fadd);
				if (!runf.exists()) {
					fout.println("System:File does not exist!");
				}else {
					fout.println("System:Start to Run!");
					fm.openFile(fadd);
				}		
			}
		}
	}
}

class tcthread extends Thread {
	private Socket ts;
	private BufferedReader tin;
	private PrintWriter tout;

	tcthread(Socket ts, BufferedReader tin, PrintWriter tout) {
		this.tin = tin;
		this.ts = ts;
		this.tout = tout;
	}

	public void run() {
		while (true) {
			String scmd = null;
			try {
				scmd = tin.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("scmd:" + scmd);
			if (scmd.equalsIgnoreCase("t 1")) {
				TaskManage t = new TaskManage();
				String tnamelist = "";
				try {
					tnamelist = t.TaskList();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("tnamelist");
				tout.println("t 1 "+tnamelist);
			} 
			if (scmd.substring(0, 3).equalsIgnoreCase("t 2")) {
				TaskManage t = new TaskManage();
				String tname = scmd.substring(4);
				try {
					t.TaskKill(tname);
				} catch (IOException e) {
					tout.println("t 2 System:Task does not exist!");
					e.printStackTrace();
				}
				tout.println("t 2 Client:Task is killed!");
			} 
		}
	}
}
