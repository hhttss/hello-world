/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class Server extends javax.swing.JFrame {

    /**
     * Creates new form Server1
     */
    public Server() {
        initComponents();
    }
    
     public void setser() throws IOException{
        ss= new ServerSocket(9000);
        s = new Socket();
        System.out.println("ssssss");
        s = ss.accept();
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(s.getOutputStream())), true);
        
        ssmsg= new ServerSocket(9001);
        msg = new Socket();
        msg = ssmsg.accept(); 
        inmsg  = new BufferedReader(new InputStreamReader(msg.getInputStream()));
        outmsg = new PrintWriter(new BufferedWriter(
				new OutputStreamWriter(msg.getOutputStream())), true);
        
        fss = new ServerSocket(9002);
        fs = new Socket();
        fs = fss.accept();
        fin =new BufferedReader(new InputStreamReader(fs.getInputStream()));
        fout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(fs.getOutputStream())),true);
        
        tss = new ServerSocket(9004);
        ts = new Socket();
        ts = tss.accept();
        tin =new BufferedReader(new InputStreamReader(ts.getInputStream()));
        tout = new PrintWriter(new BufferedWriter(new OutputStreamWriter(ts.getOutputStream())),true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

    	this.setLocation(900, 100);
    	
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("File Manage");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });


        jButton5.setText("ShowIP");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Shut Down");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("SendMessage");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEditable(false);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setText("GetImage");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton6.setText("ShowTime");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        
        jButton7.setText("TaskManage");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );


        pack();
    }// </editor-fold>

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        FileInterface fi = new FileInterface(fs,fin,fout);  
        fi.setVisible(true);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        smsg = jTextField1.getText();
        jTextArea1.append("Server:"+smsg+"\n");
        jTextField1.setText("");
        outmsg.println("Server:"+smsg);    
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
    	ShutDownInterface si = new ShutDownInterface(out);
    	si.setVisible(true);
    }
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        out.println("ip");    
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        out.println("time");    
    }
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        TaskInterface ti = new TaskInterface(ts,tin,tout);
        ti.setVisible(true);
    }  
    
    
    public static void main(String args[]) {
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Server.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        
        java.awt.EventQueue.invokeLater(new Runnable() {

           public void run() {
                Server ser1 = new Server();
                ser1.setVisible(true);
                System.out.println("111");
                try {
                	System.out.println("222");
                    ser1.setser();               
                } catch (IOException ex) {
                	 System.out.println("FUCK");
                    Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
                }
               ser1.smt = new smsgthread(ser1.msg,ser1.inmsg,ser1.jTextArea1);
               ser1.smt.start();
               ser1.st=new sthread(ser1.s,ser1.in,ser1.jTextArea1);
               ser1.st.start();
            }
        });
    }
    
    
    
    private smsgthread smt;
    private sthread st;
    private Socket ts;
    private ServerSocket tss;
    private BufferedReader tin;
    private PrintWriter tout;
    private Socket fs;
    private ServerSocket fss;
    private BufferedReader fin;
    private PrintWriter fout;
    private Socket sip;
    private ServerSocket ssip;
    private Socket s;
    private ServerSocket ss;
    private Socket msg;
    private ServerSocket ssmsg;
    private BufferedReader in;
    private BufferedReader inmsg;
    private PrintWriter out;
    private PrintWriter outmsg;
    private String smsg;
    private String cmsg;
    // Variables declaration - do not modify
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration
}

class smsgthread extends Thread{
    private Socket msg;
    private BufferedReader inmsg;
    private javax.swing.JTextArea jTextArea1;
    smsgthread(Socket msg,BufferedReader inmsg,javax.swing.JTextArea jTextArea1){
        this.inmsg=inmsg;
        this.msg=msg;
        this.jTextArea1=jTextArea1;
    }
    public void run(){
        while(true){
            String smsg = null;
			try {
				smsg = inmsg.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(smsg+'\n');
            jTextArea1.append(smsg+"\n");
        }
    }
}

class sthread extends Thread{
    private Socket s;
    private BufferedReader in;
    private javax.swing.JTextArea jTextArea1;
    sthread(Socket s,BufferedReader in, javax.swing.JTextArea jTextArea1){
        this.in=in;
        this.s=s;
        this.jTextArea1=jTextArea1;
    }
    public void run(){
        while(true){
            String scmd = null;
			try {
				scmd = in.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("scmd:"+scmd);
            jTextArea1.append(scmd+"\n");
        }
    }
}


