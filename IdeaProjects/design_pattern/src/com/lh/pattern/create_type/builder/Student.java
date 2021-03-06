package com.lh.pattern.create_type.builder;

public class Student {
	private int id;
	private String name;
	private String passwd;
	private String sex;
	private String address;

	// 构造器尽量缩小范围
	private Student() {
	}

	// 构造器尽量缩小范围
	private Student(Student origin) {
		// 拷贝一份
		this.id = origin.id;
		this.name = origin.name;
		this.passwd = origin.passwd;
		this.sex = origin.sex;
		this.address = origin.address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPasswd() {
		return passwd;
	}

	public String getSex() {
		return sex;
	}

	public String getAddress() {
		return address;
	}

	/**
	 * Student的创建完全依靠Student.Builder，使用一种方法链的方式来创建
	 * 
	 */
	public static class Builder {
		private Student student;

		public Builder() {
			student = new Student();
		}

		public Builder id(int id) {
			student.id = id;
			return this;
		}

		public Builder name(String name) {
			student.name = name;
			return this;
		}

		public Builder passwd(String passwd) {
			student.passwd = passwd;
			return this;
		}

		public Builder sex(String sex) {
			student.sex = sex;
			return this;
		}

		public Builder address(String address) {
			student.address = address;
			return this;
		}

		public Student build() {
			return new Student(student);
		}
	}
}
