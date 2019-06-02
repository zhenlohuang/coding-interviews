package net.yidooo.interviews;

/**
 * 替换空格
 */
public class ReplaceSpace {
    public String replaceSpace(StringBuffer str) {
        return str.toString().replaceAll("\\s", "%20");
    }
}
