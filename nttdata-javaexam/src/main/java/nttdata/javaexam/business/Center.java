package nttdata.javaexam.business;

public enum Center {
	IESBELEN("IES Belen"), IESCAMPANILLAS("IES Campanillas"), IESPABLOPICASSO("IES Pablo Picasso"),
	IESALIXAR("IES Alixar"), IESHERMANOSMACHADO("IES Hermanos Machado"), IESSOTEROHERNANDEZ("IES Sotero Hernández"),
	IESALMUDEYNE("IES Almudeyne"), IESCANTILLA("IES Cantillana"), CESURSEVILLA("CESUR Sevilla"),
	CESURMALAGA("CESUR Málaga"), SANTAJOAQUINADEVEDRUNA("Santa Joaquina de Vedruna"),
	SALESIANASDEMARIAAUXILIADOR("Salesianas de María Auxiliadora");

	private String nameCenter;

	Center(String nameCenter) {
		setNameCenter(nameCenter);
	}

	public String getNameCenter() {
		return nameCenter;
	}

	private void setNameCenter(String nameCenter) {
		this.nameCenter = nameCenter;
	}

}
