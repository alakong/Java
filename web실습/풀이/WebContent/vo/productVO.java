package model.vo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class productVO {
	private String halabong;
	public String getHalabong() {
		return halabong;
	}
	public void setHalabong(int halabong) {
		
		this.halabong += halabong;
	}
	public String getApple() {
		return apple;
	}
	public void setApple(int apple) {
		this.apple += apple;
	}
	public String getBanana() {
		return banana;
	}
	public void setBanana(int banana) {
		this.banana += banana;
	}
	private String apple;
	private String banana;//꺼내올때 필요함

	}

