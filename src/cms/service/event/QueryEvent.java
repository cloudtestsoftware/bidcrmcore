package cms.service.event;

import cms.service.template.TemplateTable;

public interface QueryEvent {
	
	 public  TemplateTable  doSelect(String[] column,String[] datatype,String parentfilter,boolean isform,String accessfilter);
	 
	 public  TemplateTable  doSelectChild(String childname,String relfield,String pid,String[]column,String[]datatype,String childfilter,String accessfilter);
	 
	 public  boolean   doDelete(String[] childtabs);
	 
	 public  boolean  doInsert();
}
