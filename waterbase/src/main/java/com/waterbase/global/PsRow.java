package com.waterbase.global;

/**
 * © 2012 amsoft.cn 
 * 名称：AbPsRow.java 
 * 描述：PS后得到的行信息
 * 
 * @author LiuQi
 */
public class PsRow {
	 public String pid;
	 public String cmd;
	 public String ppid;
	 public String user;
	 
	 /** 暂用的内存. */
	 public int mem;
	 
	 /** 主进程ID. */
	 public String rootPid;

     public PsRow(String line) {
         if (line == null) return;
         String[] p = line.split("[\\s]+");
         if (p.length != 9) return;
         user = p[0];
         pid = p[1];
         ppid = p[2];
         mem = Integer.parseInt(p[4]);
         cmd = p[8];
         if (isRoot()) {
        	 rootPid = pid;
         }
     }

     public boolean isRoot() {
         return "zygote".equals(cmd);
     }

     public boolean isMain() {
         return ppid.equals(rootPid) && user.startsWith("app_");
     }

     public String toString() {
         final String TAB = ";";
         String retValue = "";
         retValue = "PsRow ( " + super.toString() + TAB + "pid = " + this.pid + TAB + "cmd = " + this.cmd
                 + TAB + "ppid = " + this.ppid + TAB + "user = " + this.user + TAB + "mem = " + this.mem
                 + " )";
         return retValue;
     }
}
