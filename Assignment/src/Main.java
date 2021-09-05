public class Main {
    public static void main(String[] args) {
        Data d = new Data();
        d.zoneInput();
        d.timeRange();
        Summary s = new Summary();
        s.displaySummary();
        MenuUI m = new MenuUI();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                m.createAndShowGUI();
            }
        });

    }
}
