package Project1.Nuser;

import JDBC.DBConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class NuserDao {
  DBConnect db;
  NuserDao(){
    db = DBConnect.getInstance();
  }

  /**
   * 개인정보 추가
   * int userid, int unum, String name, String edu, String id, String tell
   * String email, String career, String license
   */
  public void insert(Nuser n){
    Connection conn =db.conn();
    String sql = "insert into nuser values('0', '0', ?, ?, ?, ?, ?, ?, ?)";
    int cnt = 0;
    try {
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, n.toString()); // name
      pstmt.setString(2, n.toString()); // edu
      pstmt.setString(3, n.toString()); // id
      pstmt.setString(4, n.toString()); // tell
      pstmt.setString(5, n.toString()); // email
      pstmt.setString(6, n.toString()); // career
      pstmt.setString(7, n.toString()); // license
      cnt = pstmt.executeUpdate();
      System.out.println(cnt + " 줄 추가됨.");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
  // 개인정보 수정
  public void edit(Nuser n){
    Connection conn =db.conn();
    String sql = "update nuser set name = ?, edu = ?, tell = ?, email = ?, career = ?, license = ?";
    int cnt = 0;
    try {
      PreparedStatement pstmt = conn.prepareStatement(sql);
      pstmt.setString(1, n.toString()); // name
      pstmt.setString(2, n.toString()); // edu
      pstmt.setString(3, n.toString()); // tell
      pstmt.setString(4, n.toString()); // email
      pstmt.setString(5, n.toString()); // career
      pstmt.setString(6, n.toString()); // license
      cnt = pstmt.executeUpdate();
      System.out.println(cnt + " 줄 추가됨.");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
  // 개인정보 삭제
  public void delete(int num){
    Connection conn =db.conn();
    String sql = "";
    int cnt = 0;
    try {
      PreparedStatement pstmt = conn.prepareStatement(sql);
      cnt = pstmt.executeUpdate();
      System.out.println(cnt + " 줄 추가됨.");
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
  // 개인정보 검색 (번호로 검색)
  public Nuser select(int num){
    Connection conn = db.conn();
    String sql = "select * from board where num=?";
    Nuser n = null;
    try {
      PreparedStatement prtmt = conn.prepareStatement(sql);
      prtmt.setInt(1, num);
      ResultSet rs = prtmt.executeQuery();
      if(rs.next()) {
        return new Nuser(rs.getInt(1), rs.getInt(2), rs.getString(3),
            rs.getString(4),rs.getString(5), rs.getString(6),
            rs.getString(7), rs.getString(8), rs.getString(9));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        conn.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return n;
  }
}
