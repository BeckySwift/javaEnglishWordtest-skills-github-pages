import java.awt.*;

public class FloatingText {
    // 浮动文字类
        String text;
        int x, y;         // 位置
        int dx, dy;       // 速度
        Color color;      // 颜色
        Font font;        // 字体

        public FloatingText(String text, int x, int y, int dx, int dy, Color color, Font font) {
            this.text = text;
            this.x = x;
            this.y = y;
            this.dx = dx;
            this.dy = dy;
            this.color = color;
            this.font = font;
        }

        // 更新位置
        public void update(int width, int height) {
            x += dx;
            y += dy;

            // 边界检测 - 碰到边界反弹
            if (x <= 0 || x >= width - 50) {
                dx = -dx;
            }
            if (y <= 20 || y >= height - 20) {
                dy = -dy;
            }
        }
    }

