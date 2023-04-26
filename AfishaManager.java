public class AfishaManager {
    public Movies [] movies=new Movies[0];
public void add (Movies movie){
    Movies [] tmp=new Movies[movie.length+1];
    for (int i=0; i<movie.length;i++){
        tmp [i]=movie[i];
    }
    tmp[tmp.length-1]=movie;
    this.movies=tmp;
}

}
