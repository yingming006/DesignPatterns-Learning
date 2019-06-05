package _08abstractfactory.listfactory;

import _08abstractfactory.factory.Item;
import _08abstractfactory.factory.Tray;

import java.util.Iterator;

/**
 * @author yingming006
 * Date: 2019/6/5
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("<li>\n");
        buffer.append(caption).append("\n");
        buffer.append("<ul>\n");
        for (Object obj : tray) {
            Item item = (Item) obj;
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }
}
