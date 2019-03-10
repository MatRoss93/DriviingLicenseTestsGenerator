package pl.prawojazdy.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pytania")
public class Pytania {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "nazwapytania")
	private String nazwaPytania;
	@Column(name = "numerpytania")
	private int numerPytania;
	@Column(name = "pytanie")
	private String pytanie;
	@Column(name = "odpowiedza")
	private String odpowiedzA;
	@Column(name = "odpowiedzb")
	private String odpowiedzB;
	@Column(name = "odpowiedzc")
	private String odpowiedzC;
	@Column(name = "poprawnaodp")
	private char poprawnaOdp;
	@Column(name = "media")
	private String media;
	@Column(name = "zakresstruktury")
	private String zakresStruktury;
	@Column(name = "liczbapunktow")
	private int liczbaPunktow;
	@Column(name = "kategorie")
	private String kategorie;
	@Column(name = "nazwabloku")
	private String nazwaBloku;
	@Column(name = "zrodlopytania")
	private String zrodloPytania;
	@Column(name = "oco")
	private String oCo;
	@Column(name = "zwiazekzbezpieczenstwem")
	private String zwiazekZBezpieczenstweml;
	
	public Pytania() {}
	
	public Pytania(int id, String nazwaPytania, int numerPytania, String pytanie, String odpowiedzA, String odpowiedzB,
			String odpowiedzC, char poprawnaOdp, String media, String zakresStruktury, int liczbaPunktow,
			String kategorie, String nazwaBloku, String zrodloPytania, String oCo, String zwiazekZBezpieczenstweml) {
		super();
		this.id = id;
		this.nazwaPytania = nazwaPytania;
		this.numerPytania = numerPytania;
		this.pytanie = pytanie;
		this.odpowiedzA = odpowiedzA;
		this.odpowiedzB = odpowiedzB;
		this.odpowiedzC = odpowiedzC;
		this.poprawnaOdp = poprawnaOdp;
		this.media = media;
		this.zakresStruktury = zakresStruktury;
		this.liczbaPunktow = liczbaPunktow;
		this.kategorie = kategorie;
		this.nazwaBloku = nazwaBloku;
		this.zrodloPytania = zrodloPytania;
		this.oCo = oCo;
		this.zwiazekZBezpieczenstweml = zwiazekZBezpieczenstweml;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwaPytania() {
		return nazwaPytania;
	}
	public void setNazwaPytania(String nazwaPytania) {
		this.nazwaPytania = nazwaPytania;
	}
	public int getNumerPytania() {
		return numerPytania;
	}
	public void setNumerPytania(int numerPytania) {
		this.numerPytania = numerPytania;
	}
	public String getPytanie() {
		return pytanie;
	}
	public void setPytanie(String pytanie) {
		this.pytanie = pytanie;
	}
	public String getOdpowiedzA() {
		return odpowiedzA;
	}
	public void setOdpowiedzA(String odpowiedzA) {
		this.odpowiedzA = odpowiedzA;
	}
	public String getOdpowiedzB() {
		return odpowiedzB;
	}
	public void setOdpowiedzB(String odpowiedzB) {
		this.odpowiedzB = odpowiedzB;
	}
	public String getOdpowiedzC() {
		return odpowiedzC;
	}
	public void setOdpowiedzC(String odpowiedzC) {
		this.odpowiedzC = odpowiedzC;
	}
	public char getPoprawnaOdp() {
		return poprawnaOdp;
	}
	public void setPoprawnaOdp(char poprawnaOdp) {
		this.poprawnaOdp = poprawnaOdp;
	}
	public String getMedia() {
		return media;
	}
	public void setMedia(String media) {
		this.media = media;
	}
	public String getZakresStruktury() {
		return zakresStruktury;
	}
	public void setZakresStruktury(String zakresStruktury) {
		this.zakresStruktury = zakresStruktury;
	}
	public int getLiczbaPunktow() {
		return liczbaPunktow;
	}
	public void setLiczbaPunktow(int liczbaPunktow) {
		this.liczbaPunktow = liczbaPunktow;
	}
	public String getKategorie() {
		return kategorie;
	}
	public void setKategorie(String kategorie) {
		this.kategorie = kategorie;
	}
	public String getNazwaBloku() {
		return nazwaBloku;
	}
	public void setNazwaBloku(String nazwaBloku) {
		this.nazwaBloku = nazwaBloku;
	}
	public String getZrodloPytania() {
		return zrodloPytania;
	}
	public void setZrodloPytania(String zrodloPytania) {
		this.zrodloPytania = zrodloPytania;
	}
	public String getoCo() {
		return oCo;
	}
	public void setoCo(String oCo) {
		this.oCo = oCo;
	}
	public String getZwiazekZBezpieczenstweml() {
		return zwiazekZBezpieczenstweml;
	}
	public void setZwiazekZBezpieczenstweml(String zwiazekZBezpieczenstweml) {
		this.zwiazekZBezpieczenstweml = zwiazekZBezpieczenstweml;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((kategorie == null) ? 0 : kategorie.hashCode());
		result = prime * result + liczbaPunktow;
		result = prime * result + ((media == null) ? 0 : media.hashCode());
		result = prime * result + ((nazwaBloku == null) ? 0 : nazwaBloku.hashCode());
		result = prime * result + ((nazwaPytania == null) ? 0 : nazwaPytania.hashCode());
		result = prime * result + numerPytania;
		result = prime * result + ((oCo == null) ? 0 : oCo.hashCode());
		result = prime * result + ((odpowiedzA == null) ? 0 : odpowiedzA.hashCode());
		result = prime * result + ((odpowiedzB == null) ? 0 : odpowiedzB.hashCode());
		result = prime * result + ((odpowiedzC == null) ? 0 : odpowiedzC.hashCode());
		result = prime * result + poprawnaOdp;
		result = prime * result + ((pytanie == null) ? 0 : pytanie.hashCode());
		result = prime * result + ((zakresStruktury == null) ? 0 : zakresStruktury.hashCode());
		result = prime * result + ((zrodloPytania == null) ? 0 : zrodloPytania.hashCode());
		result = prime * result + ((zwiazekZBezpieczenstweml == null) ? 0 : zwiazekZBezpieczenstweml.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pytania other = (Pytania) obj;
		if (id != other.id)
			return false;
		if (kategorie == null) {
			if (other.kategorie != null)
				return false;
		} else if (!kategorie.equals(other.kategorie))
			return false;
		if (liczbaPunktow != other.liczbaPunktow)
			return false;
		if (media == null) {
			if (other.media != null)
				return false;
		} else if (!media.equals(other.media))
			return false;
		if (nazwaBloku == null) {
			if (other.nazwaBloku != null)
				return false;
		} else if (!nazwaBloku.equals(other.nazwaBloku))
			return false;
		if (nazwaPytania == null) {
			if (other.nazwaPytania != null)
				return false;
		} else if (!nazwaPytania.equals(other.nazwaPytania))
			return false;
		if (numerPytania != other.numerPytania)
			return false;
		if (oCo == null) {
			if (other.oCo != null)
				return false;
		} else if (!oCo.equals(other.oCo))
			return false;
		if (odpowiedzA == null) {
			if (other.odpowiedzA != null)
				return false;
		} else if (!odpowiedzA.equals(other.odpowiedzA))
			return false;
		if (odpowiedzB == null) {
			if (other.odpowiedzB != null)
				return false;
		} else if (!odpowiedzB.equals(other.odpowiedzB))
			return false;
		if (odpowiedzC == null) {
			if (other.odpowiedzC != null)
				return false;
		} else if (!odpowiedzC.equals(other.odpowiedzC))
			return false;
		if (poprawnaOdp != other.poprawnaOdp)
			return false;
		if (pytanie == null) {
			if (other.pytanie != null)
				return false;
		} else if (!pytanie.equals(other.pytanie))
			return false;
		if (zakresStruktury == null) {
			if (other.zakresStruktury != null)
				return false;
		} else if (!zakresStruktury.equals(other.zakresStruktury))
			return false;
		if (zrodloPytania == null) {
			if (other.zrodloPytania != null)
				return false;
		} else if (!zrodloPytania.equals(other.zrodloPytania))
			return false;
		if (zwiazekZBezpieczenstweml == null) {
			if (other.zwiazekZBezpieczenstweml != null)
				return false;
		} else if (!zwiazekZBezpieczenstweml.equals(other.zwiazekZBezpieczenstweml))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Pytania [id=" + id + ", nazwaPytania=" + nazwaPytania + ", numerPytania=" + numerPytania + ", pytanie="
				+ pytanie + ", odpowiedzA=" + odpowiedzA + ", odpowiedzB=" + odpowiedzB + ", odpowiedzC=" + odpowiedzC
				+ ", poprawnaOdp=" + poprawnaOdp + ", media=" + media + ", zakresStruktury=" + zakresStruktury
				+ ", liczbaPunktow=" + liczbaPunktow + ", kategorie=" + kategorie + ", nazwaBloku=" + nazwaBloku
				+ ", zrodloPytania=" + zrodloPytania + ", oCo=" + oCo + ", zwiazekZBezpieczenstweml="
				+ zwiazekZBezpieczenstweml + "]";
	}
	
	
}
