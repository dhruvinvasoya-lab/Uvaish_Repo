class closepopupdialog {

	public static void closepopupdialog() {
		tg.wait(5);
		tg.switchToFrame("ele_JoinNowPopupFrame");
		tg.wait(3);
		tg.click("ele_CloseButtonPopup");
	}
}