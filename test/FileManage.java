package test;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;

;

public class FileManage {
	public FileManage(File sr) {
		this.sr = sr;
		this.present = sr;
		// this.ancester = this.createTree();
	}

	public String printChild() {
		child = present.listFiles();
		String ch = null;
		System.out.println(present.getPath() + ":");
		ch = present.getPath() + ":";
		for (int i = 0; i < child.length; i++) {
			ch = ch + "^" + child[i].getName();
		}
		return ch;
	}

	public String getPresent() {
		if (present != null) {
			String presentadd = this.present.getPath();
			return presentadd;
		} else {
			return "";
		}
	}

	public void setPresent(File presentadd) {
		this.present = presentadd;
	}

	public int iffolder() {
		if (present.isDirectory()) {
			return 1;
		} else {
			return 0;
		}
	}

	public int ifexist() {
		if (present.exists()) {
			return 1;
		} else {
			return 0;
		}
	}

	public int openFile(String s) {
		try {
			Desktop.getDesktop().open(new File(s));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return 1;
	}

	public void removeFile(String Des, String Old) {
		File newFile = new File(Des);
		File oldFile = new File(Old);
		oldFile.renameTo(newFile);
		JOptionPane.showMessageDialog(null, "File has Removed to Destination!",
				"!Successfully Done!", JOptionPane.ERROR_MESSAGE);

	}

	public void copyFile(String Des, String Old) {
		try {
			int byteread = 0;
			File oldfile = new File(Old);
			if (oldfile.exists()) {
				InputStream in = new FileInputStream(Old);
				FileOutputStream fs = new FileOutputStream(Des);
				byte[] buffer = new byte[1444];
				while ((byteread = in.read(buffer)) != -1) {
					fs.write(buffer, 0, byteread);
				}
				in.close();
				fs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delFile(String fadd){
		Runtime r =Runtime.getRuntime();
		try {
			r.exec("cmd /c del "+fadd);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/*
	 * public DefaultMutableTreeNode createTree() { File file[] =
	 * File.listRoots(); DefaultMutableTreeNode root = new
	 * DefaultMutableTreeNode("计算机"); for (int i = 0; i < file.length; i++) {
	 * DefaultMutableTreeNode dtmn = new DefaultMutableTreeNode(
	 * file[i].getPath()); dtmn = createFile(dtmn, file[i]); root.add(dtmn); }
	 * 
	 * return root; }
	 * 
	 * // 循环得到所有的文件 public static DefaultMutableTreeNode createFile(
	 * DefaultMutableTreeNode root, File file) { File fil[] = file.listFiles();
	 * // 如果数组为空，不进行任何操作 if (null == fil) {
	 * 
	 * } // 否则进行循环 else { for (int i = 0; i < fil.length; i++) { //
	 * 创建一个DefaultMutableTreeNode对象，并添加至root DefaultMutableTreeNode dmtn = new
	 * DefaultMutableTreeNode( fil[i].getName()); root.add(dmtn); // 如果是目录，迭代 if
	 * (fil[i].isDirectory()) { dmtn = createFile(dmtn, fil[i]); } // 否则，不进行任何操作
	 * else if (fil[i].isFile()) {
	 * 
	 * } } } return root; }
	 */

	public void showFileTree() {

	}

	private File sr;
	private File[] child;
	private File present;
	private TreeNode ancester;

}
