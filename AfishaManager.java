public class AfishaManager {
    public Movies [] movies=new Movies[0];
public void save (Movies movies){
    Movies [] tmp=new Movies[movies.length+1];
    for (int i=0; i<movies.length;i++){
        tmp [i]=movies[i];
    }
    tmp[tmp.length-1]=movies;
    movies=tmp;
}

}
