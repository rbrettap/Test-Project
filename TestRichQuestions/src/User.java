/**
 * @date 2014-05-18
 * @author Rich Brett (richard@perkmobile.com)
 */
public class User implements Comparable<User> {
	private String id;

	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	

	public boolean isAuthorized() {
		return true;
	}
	
	@Override
	public int compareTo(User other) {

		if (!this.getId().equalsIgnoreCase(other.getId()))
            return this.getId().compareTo(other.getId());
		
		return 0;
	}
}