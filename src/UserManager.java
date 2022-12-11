public class UserManager {
  public void addUser(User user) {
      System.out.println("Yeni Kullanıcı: " + user.getFirstName()+" "+user.getLastName()+" "+user.getId());
  }
}
