package sample.hello.pojo;

public class NumberDivisibleByTwoOthers {

	private int firstDivisible;
	private int secondDivisible;
	private int number;

	public int getFirstDivisible() {
		return firstDivisible;
	}

	public void setFirstDivisible(int firstDivisible) {
		this.firstDivisible = firstDivisible;
	}

	public int getSecondDivisible() {
		return secondDivisible;
	}

	public void setSecondDivisible(int secondDivisible) {
		this.secondDivisible = secondDivisible;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String checkDivisiblity() {
		String result = null;
		if (number % firstDivisible == 0 && number % secondDivisible == 0) {
			result = "number=" + number + " divisible by " + firstDivisible
					+ " and " + secondDivisible;
		} else if (number % firstDivisible == 0
				&& number % secondDivisible != 0) {
			result = "number=" + number + " divisible by " + firstDivisible;
		} else if (number % firstDivisible != 0
				&& number % secondDivisible == 0) {
			result = "number=" + number + " divisible by " + secondDivisible;
		} else {
			result = "number=" + number + " is not divisible by "
					+ firstDivisible + " and " + secondDivisible;
		}
		return result;
	}

}
