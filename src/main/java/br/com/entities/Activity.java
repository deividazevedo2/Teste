package br.com.entities;

public class Activity extends Animal {

	private String late;
	private String mia;
	private String grunhe;
	private String ruge;
	private String dorme;
	private String come;
	private String caga;
	private String mija;

	@SuppressWarnings("unused")
	private Activity(String late) {
		this.late = late;

	}

	public Activity() {
	}

	public String getMija() {
		return mija;
	}

	public void setMija(String mija) {
		this.mija = mija;
	}

	public String getCaga() {
		return caga;
	}

	public void setCaga(String caga) {
		this.caga = caga;
	}

	public String getLate() {
		return late;
	}

	public void setLate(String late) {
		this.late = late;
	}

	public String getMia() {
		return mia;
	}

	public void setMia(String mia) {
		this.mia = mia;
	}

	public String getGrunhe() {
		return grunhe;
	}

	public void setGrunhe(String grunhe) {
		this.grunhe = grunhe;
	}

	public String getRuge() {
		return ruge;
	}

	public void setRuge(String ruge) {
		this.ruge = ruge;
	}

	public String getDorme() {
		return dorme;
	}

	public void setDorme(String dorme) {
		this.dorme = dorme;
	}

	public String getCome() {
		return come;
	}

	public void setCome(String come) {
		this.come = come;
	}

	@Override
	public String toString() {
		return "Activity [late=" + late + ", mia=" + mia + ", grunhe=" + grunhe
				+ ", ruge=" + ruge + ", dorme=" + dorme + ", come=" + come
				+ "]";
	}

}
