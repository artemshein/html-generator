package j2html.tags;


import org.apache.commons.lang3.StringEscapeUtils;

public class Text extends Tag {

    public Text(String text) {
        super(text);
    }

    @Override
    public String render() {
        return StringEscapeUtils.escapeHtml4(tag);
    }

    @Override
    public String toString() {
        return this.render();
    }

}
