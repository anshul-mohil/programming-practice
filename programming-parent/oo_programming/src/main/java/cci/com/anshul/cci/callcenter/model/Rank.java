package com.anshul.cci.callcenter.model;

public class Rank {

	private final int myRank;

	@Override
	public String toString() {
		return "Rank [myRank=" + myRank + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + myRank;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (this.getClass() != obj.getClass())
			return false;
		Rank other = (Rank) obj;
		if (myRank != other.myRank)
			return false;
		return true;
	}

	public Rank(int myRank) {
		this.myRank = myRank;
	}

	public int getMyRank() {
		return myRank;
	}
}
