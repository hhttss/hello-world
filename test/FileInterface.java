package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.UIManager;

public class FileInterface extends javax.swing.JFrame {

	public FileInterface(Socket fs, BufferedReader fin, PrintWriter fout) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FileInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FileInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FileInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FileInterface.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		this.fs = fs;
		this.fin = fin;
		this.fout = fout;

		initComponents();
		fst = new fsthread(fs, fin, jTextArea1);
		fst.start();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jLabel1 = new javax.swing.JLabel();
		jButton2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jTextField5 = new javax.swing.JTextField();
		jButton6 = new javax.swing.JButton();
		jLabel6 = new javax.swing.JLabel();
		jTextField6 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jTextField7 = new javax.swing.JTextField();
		jButton7 = new javax.swing.JButton();
		jLabel8 = new javax.swing.JLabel();
		jTextField8 = new javax.swing.JTextField();

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jScrollPane1.setViewportView(jTextArea1);

		jButton4.setText("Enter File");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jButton1.setText("Move File");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextField2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField2ActionPerformed(evt);
			}
		});

		jLabel1.setText("NewAdd");

		jButton2.setText("Del File");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel2.setText("OldAdd");

		jLabel3.setText("FileAdd");

		jLabel4.setText("FileAdd");

		jButton3.setText("Exit");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton5.setText("Run File");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jLabel5.setText("FileAdd");

		jButton6.setText("Copy File To");
		jButton6.setActionCommand("Copy File");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jLabel6.setText("OldAdd");

		jLabel7.setText("NewAdd");

		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
			}
		});

		jButton7.setText("Enter Child");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jLabel8.setText("ChildAdd");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
																.addComponent(
																		jButton3,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		93,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jButton5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						93,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jLabel5))
																.addGroup(
																		layout.createSequentialGroup()
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(
																										jButton1,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE)
																								.addComponent(
																										jButton4,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										javax.swing.GroupLayout.DEFAULT_SIZE,
																										Short.MAX_VALUE))
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addGroup(
																						layout.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																								.addComponent(
																										jLabel3,
																										javax.swing.GroupLayout.PREFERRED_SIZE,
																										42,
																										javax.swing.GroupLayout.PREFERRED_SIZE)
																								.addComponent(
																										jLabel1))
																				.addGap(6,
																						6,
																						6))
																.addGroup(
																		layout.createSequentialGroup()
																				.addComponent(
																						jButton7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						93,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addPreferredGap(
																						javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																				.addComponent(
																						jLabel8)))
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																				.addComponent(
																						jButton6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						1,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						93,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																				.addGroup(
																						layout.createSequentialGroup()
																								.addPreferredGap(
																										javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																								.addComponent(
																										jLabel4))
																				.addGroup(
																						layout.createSequentialGroup()
																								.addGap(4,
																										4,
																										4)
																								.addGroup(
																										layout.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																												.addComponent(
																														jLabel7)
																												.addComponent(
																														jLabel6)
																												.addComponent(
																														jLabel2))))))
								.addGap(24, 24, 24)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING,
												false)
												.addComponent(
														jTextField1,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField2,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField5,
														javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														197, Short.MAX_VALUE)
												.addComponent(
														jTextField4,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField7,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jTextField3,
														javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jTextField6)
												.addComponent(jTextField8))
								.addGap(18, 18, 18)
								.addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										258, Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jScrollPane1)
												.addGroup(
														layout.createSequentialGroup()
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jButton7)
																				.addComponent(
																						jLabel8)
																				.addComponent(
																						jTextField8,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addGap(6, 6, 6)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jButton4)
																				.addComponent(
																						jTextField1,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel3))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jButton1)
																				.addComponent(
																						jTextField2,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel1,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jTextField3,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel2,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addGap(2, 2, 2)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jTextField7,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel7,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE)
																				.addComponent(
																						jButton6))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jTextField6,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel6,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						Short.MAX_VALUE))
																.addGap(14, 14,
																		14)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jButton2)
																				.addComponent(
																						jTextField4,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE)
																				.addComponent(
																						jLabel4))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addGroup(
																		layout.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.BASELINE)
																				.addComponent(
																						jButton5)
																				.addComponent(
																						jLabel5)
																				.addComponent(
																						jTextField5,
																						javax.swing.GroupLayout.PREFERRED_SIZE,
																						javax.swing.GroupLayout.DEFAULT_SIZE,
																						javax.swing.GroupLayout.PREFERRED_SIZE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																.addComponent(
																		jButton3)))
								.addContainerGap()));

		pack();
	}// </editor-fold>

	private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		fadd = this.jTextField1.getText();
		fout.println("f 1 " + fadd);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		oadd = this.jTextField3.getText();
		nadd = this.jTextField2.getText();
		fout.println("f 2 " + oadd + "^" + nadd);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		fadd = this.jTextField4.getText(); 
		fout.println("f 3 "+fadd);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		fadd = this.jTextField5.getText(); 
		fout.println("f 4 "+fadd);
	}

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		this.dispose();
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		oadd = this.jTextField6.getText();
		nadd = this.jTextField7.getText();
		fout.println("f 6 " + oadd + "^" + nadd);
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		fadd = this.jTextField8.getText();
		fout.println("f 7 " + fadd);
	}

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	// Variables declaration - do not modify

	private Socket fs;
	private BufferedReader fin;
	private fsthread fst;
	private PrintWriter fout;
	private String fadd;
	private String nadd;
	private String oadd;
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextField8;
	// End of variables declaration
}

class fsthread extends Thread {
	private Socket fs;
	private BufferedReader fin;
	private javax.swing.JTextArea jTextArea1;

	fsthread(Socket fs, BufferedReader fin, javax.swing.JTextArea jTextArea1) {
		this.fin = fin;
		this.fs = fs;
		this.jTextArea1 = jTextArea1;
	}

	public void run() {
		while (true) {
			String fstream = null;
			try {
				fstream = fin.readLine();
				System.out.println("FileInterface:" + fstream);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (fstream.substring(0, 3).equalsIgnoreCase("f 9")) {
				jTextArea1.append("System:" + fstream.substring(4)
						+ " does not exist!");
			} else if (fstream.substring(0, 3).equalsIgnoreCase("f 0")) {
				jTextArea1.append("System:" + fstream.substring(4)
						+ " is not a Directory!");
			} else if (fstream.substring(0, 3).equalsIgnoreCase("f 1")) {
				for (int i = 4; i < fstream.length(); i++) {
					if (fstream.charAt(i) == '^') {
						jTextArea1.append("\n");
					} else {
						char data = fstream.charAt(i);
						jTextArea1.append(String.valueOf(data));
					}
				}
				jTextArea1.append("\n");
				jTextArea1.append("\n");
			} else {
				jTextArea1.append(fstream+"\n");
			}

		}
	}
}
