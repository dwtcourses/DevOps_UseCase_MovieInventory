package com.psl.jdbc;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



public class dataAccess {

	
	public void addNew(Movie m) throws ClassNotFoundException
    {
        try 
        {
            
            PreparedStatement ps=DBUtils.getPreparedStatement("insert into Movie values(?,?,?,?)");
            ps.setInt(1, 1);
            ps.setString(2, m.getName());
            ps.setString(3, m.getDate());
            ps.setString(4, m.getLanguage());
            ps.executeUpdate();
           
        } 
        catch (SQLException ex) 
        {
            System.out.printf("Movie record already exists");
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
	
	public static List<Movie> getAll() throws ClassNotFoundException
    {
        List<Movie> ls=new LinkedList<Movie>();
        try {
            ResultSet rs=  (ResultSet) DBUtils.getPreparedStatement("select m.movieName,m.showDate,m.lang from Movie m").executeQuery();
            while(rs.next())
            {
                Movie movie=new Movie(rs.getString(1),rs.getString(2),rs.getString(3));
                ls.add(movie);
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(dataAccess.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ls;
    }
}
