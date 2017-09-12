package cms.service.event;

import cms.service.app.ApplicationConstants;
import cms.service.template.TemplateTable;
import cms.service.template.TemplateUtility;

public abstract class QueryImpl {

	 protected static ApplicationConstants ACONST =new ApplicationConstants(); 
	 protected static TemplateUtility tu=new TemplateUtility();
	 protected TemplateTable maindata=new TemplateTable();
	 protected String searchdata,object,parentobjid,filters,relationfilter, bqn;
	 protected String username, groupuser,token,clientip; 
	 protected int pagesize=30; 
	 protected int page;
	 protected String mainxml;


	 public String ContactFilter="";

	 public String contactAccessFilter="";

	 public void setObject(String object){
		 this.object=object;
	 }
	 public String getObject(){
		 return(this.object);
	 }
	 public void setFilters(String filters){
		 this.filters=filters;
	 }
	 public String getFilters(){
		 return(filters);
	 }
	 public void setBqn(String bqn){
		 this.bqn=bqn;
	 }
	 public String getBqn(){
		 return(bqn);
	 }
	 public void setClientip(String clientip){
		 this.clientip=clientip;
	 }
	 public String getClientip(){
		 return(clientip);
	 }
	 public void setPagesize(int pagesize){
		 this.pagesize=pagesize;
	 }
	 public  int getPagesize(){
		 return(pagesize);
	 }
	 public void setPage(int page){
		 this.page=page;
	 }
	 public int getPage(){
		 return(page);
	 }
	 public void setRelationFilters(String relationfilter){
		 this.relationfilter=relationfilter;
	 }
	 public String getRelationFilters(){
		 return(relationfilter);
	 }
	 public void setToken(String token){
		 this.token=token;
	 }
	 public String getToken(){
		 return(token);
	 }
	 public void setUsername(String username){
		 this.username=username;
	 }
	 public String getUsername(){
		 return(username);
	 }
	 public void setMainxml(String mainxml){
		 this.mainxml=mainxml;
	 }
	 public String getMainxml(){
		 return(mainxml);
	 }
	 public void setGroupuser(String groupuser){
		 this.groupuser=groupuser;
	 }
	 public String getGroupuser(){
		 return(groupuser);
	 }
	 public void setSearchdata(String searchdata){
		 this.searchdata=searchdata;
	 }
	 public String getSearchdata(){
		 return(searchdata);
	 }
	 public void setParentobjid(String parentobjid){
		 this.parentobjid=parentobjid;
	 }
	 public String getParentobjid(){
		 return(parentobjid);
	 }

}
