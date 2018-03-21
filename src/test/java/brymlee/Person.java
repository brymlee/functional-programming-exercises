package brymlee;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Person {
	private String name;
	private Integer age;

	public String getName() {
		return name;
	}

	public Integer getAge() {
		return age;
	}

	public Person(final String name, final Integer age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(final Object object) {
		if(!(object instanceof Person)) {
			return false;	
		}
		final Person person = (Person) object;
		return new EqualsBuilder()
			.append(this.name, person.getName())	
			.append(this.age, person.getAge())
			.build();
	}
}
