package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LotteryTheme extends Message {
    public static final String DEFAULT_BGCOLOR = "";
    public static final String DEFAULT_BGIMAGE = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String bgcolor;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bgimage;

    public static final class Builder extends Message.Builder<LotteryTheme> {
        public String bgcolor;
        public String bgimage;

        public Builder() {
        }

        public Builder(LotteryTheme lotteryTheme) {
            super(lotteryTheme);
            if (lotteryTheme == null) {
                return;
            }
            this.bgcolor = lotteryTheme.bgcolor;
            this.bgimage = lotteryTheme.bgimage;
        }

        @Override // com.squareup.wire.Message.Builder
        public LotteryTheme build(boolean z) {
            return new LotteryTheme(this, z);
        }
    }

    public LotteryTheme(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.bgcolor;
            if (str == null) {
                this.bgcolor = "";
            } else {
                this.bgcolor = str;
            }
            String str2 = builder.bgimage;
            if (str2 == null) {
                this.bgimage = "";
                return;
            } else {
                this.bgimage = str2;
                return;
            }
        }
        this.bgcolor = builder.bgcolor;
        this.bgimage = builder.bgimage;
    }
}