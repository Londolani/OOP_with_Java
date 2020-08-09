
public class Image{

    private String url;
    private String description;
    private String title;
   // private String [] tags ;
    
   
    Image(String url,String title,String description){
      this.url = url;
      this.description = description;
      this.title = title;
    }
  

   public String getUrl(){return this.url;}
   public String getDescription(){return this.description;}
   public String getTitle(){return this.title;}
   //public String[] getTags(){return this.tags;}
   
   public void setUrl(String newUrl){this.url = newUrl;}
   public void setDescription(String newDescription){this.description = newDescription;}
   public void setTitle(String newTitle){this.title = newTitle;}
   //public void setTags(String[] newTags){this.tags = newTags;} 

}