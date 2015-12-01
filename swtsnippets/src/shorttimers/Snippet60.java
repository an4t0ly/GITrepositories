package shorttimers;

/*
 * Display example snippet: create two one shot timers (5000 ms, 2000 ms)
 *
 * For a list of all SWT example snippets see
 * http://www.eclipse.org/swt/snippets/
 */
import org.eclipse.swt.widgets.*;

public class Snippet60 {

public static void main (String [] args) {
	Display display = new Display ();
	Shell shell = new Shell (display);
	shell.setSize (200, 200);
	shell.open ();
	display.timerExec (5000, new Runnable () {
		@Override
		public void run () {
			System.out.println ("5000");
		}
	});
	display.timerExec (2000, new Runnable () {
		@Override
		public void run () {
			System.out.println ("2000");
		}
	});
	while (!shell.isDisposed ()) {
		if (!display.readAndDispatch ()) display.sleep ();
	}
	display.dispose ();
}
} 