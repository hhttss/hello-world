package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class TaskInterface extends javax.swing.JFrame {

	public TaskInterface(Socket ts, BufferedReader tin, PrintWriter tout) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(TaskInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(TaskInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(TaskInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(TaskInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		this.tin = tin;
		this.ts = ts;
		this.tout = tout;
		initComponents();
		tst = new tsthread(ts, tin, jTextArea1);
		tst.start();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton2 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jButton1.setText("TaskList");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton2.setText("KillTask");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jTextField1.setText("TaskName");

		jButton3.setText("Exit");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
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
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jButton1)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jScrollPane1,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		289,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jButton3,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton2,
																						javax.swing.GroupLayout.Alignment.LEADING,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jTextField1)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jScrollPane1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														219,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jButton1))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED,
										10, Short.MAX_VALUE)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(jButton2)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(
										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jButton3).addGap(9, 9, 9)));

		pack();
	}// </editor-fold>

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		tout.println("t 1");
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		String tname = "";
		tname = jTextField1.getText();
		tout.println("t 2 " + tname);		
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private tsthread tst;
	private Socket ts;
	private BufferedReader tin;
	private PrintWriter tout;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;

}

class tsthread extends Thread {
	private Socket ts;
	private BufferedReader tin;
	private javax.swing.JTextArea jTextArea1;

	tsthread(Socket ts, BufferedReader tin, javax.swing.JTextArea jTextArea1) {
		this.tin = tin;
		this.ts = ts;
		this.jTextArea1 = jTextArea1;
	}

	public void run() {
		while (true) {
			String tstream = "";
			try {
				tstream = tin.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (tstream.substring(0, 3).equalsIgnoreCase("t 1")) {
				String tnamelist = tstream.substring(4);
				for (int i = 4; i < tstream.length(); i++) {
					if (tstream.charAt(i) == '^') {
						tnamelist = tnamelist + '\n';
					} else {
						char a = tstream.charAt(i);
						tnamelist = tnamelist + String.valueOf(a);
					}
				}
				jTextArea1.append(tnamelist);
			}
			if (tstream.substring(0, 3).equalsIgnoreCase("t 2")) {
				String t = tstream.substring(4);
				jTextArea1.append(t);
			}

		}
	}
}
