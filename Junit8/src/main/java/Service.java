
public class Service {
	private User u;
	

    public Service(User u) {
        this.u=u;
    }

    public String getName(int id) {
        return u.getUserName(id);
    }
}
