package modelos;

public class Libro {
    // Atributos
    private String title;
    private String author;
    private int pages;

    // getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        if(pages>0){
            this.pages = pages*7;
        }
    }

    public void imprimirDatos(){
        System.out.println();
        System.out.println("Título: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Páginas: " + pages);
        System.out.println();
    }

    

}
