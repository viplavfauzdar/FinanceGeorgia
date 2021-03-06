package com.viplav.financegeorgia.db;
// Generated Nov 30, 2013 12:39:55 PM by Hibernate Tools 3.2.1.GA



/**
 * ProjectId generated by hbm2java
 */
public class ProjectId  implements java.io.Serializable {


     private int id;
     private int userId;

    public ProjectId() {
    }

    public ProjectId(int id, int userId) {
       this.id = id;
       this.userId = userId;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ProjectId) ) return false;
		 ProjectId castOther = ( ProjectId ) other; 
         
		 return (this.getId()==castOther.getId())
 && (this.getUserId()==castOther.getUserId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getId();
         result = 37 * result + this.getUserId();
         return result;
   }   


}


