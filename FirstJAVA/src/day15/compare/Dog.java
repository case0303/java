package day15.compare;

public class Dog implements Comparable<Dog> {
	String dogid;
	String dogName;
	int weight;
	
	//Comparable 인터페이스의 추상 메서드
	@Override
	public int compareTo(Dog o) {
		return this.weight - o.weight;//비교값 정리
	}
	
	
	public Dog(String dogid, String dogName, int weight) {
		super();
		this.dogid = dogid;
		this.dogName = dogName;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return "dog [dogid="+dogid+", dogName="+dogName+"]"+this.hashCode();
	}

	public String getDogid() {
		return dogid;
	}

	public void setDogid(String dogid) {
		this.dogid = dogid;
	}

	public String getDogName() {
		return dogName;
	}

	public void setDogName(String dogName) {
		this.dogName = dogName;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	//비교를 하기 위해서는 반드시 hashCode(), equals()를 둘다 재정의 해야 함.
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true; // 생성된 객체 그 자체를 비교하는 상황
		if(obj == null) return false; // obj의 객체가 생성되지 않은 상황
		if(getClass() != obj.getClass()) return false; // 생성 클래스 비교
		//내부 멤버에 대한 비교
		Dog other = (Dog)obj;
		if(dogid == null) {
			if(other.dogid != null) {
				return false;
			}
		}else if(!dogid.equals(other.dogid)){
			return false;
		}
		
		if(dogName == null) {
			if(other.dogName != null) {
				return false;
			}
				
		}else if (!dogName.equals(other.dogName)) {
			return false;
		}
		if(weight != other.weight) {
			return false;
		}
		return true; //위에 false인 경우 해당되지 않으면 true
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1 ;
		result = prime * result + ((dogid == null) ? 0:dogid.hashCode());
		result = prime * result + ((dogName == null) ? 0 : dogName.hashCode());
		result = prime * result + weight;
		return result;
	}
	
	
	
}
