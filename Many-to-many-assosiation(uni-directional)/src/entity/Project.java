package entity;

public class Project {
	int pId;
	String pName;
	String pMgr;
	public Project(int pId, String pName, String pMgr) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pMgr = pMgr;
	}
	public int getpId() {
		return pId;
	}
	public String getpName() {
		return pName;
	}
	public String getpMgr() {
		return pMgr;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pName=" + pName + ", pMgr=" + pMgr + "]";
	}
	
	
}
