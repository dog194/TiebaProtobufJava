package protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThemeColorInfo extends Message {

    @ProtoField(tag = 3)
    public final ThemeElement dark;

    @ProtoField(tag = 1)
    public final ThemeElement day;

    @ProtoField(tag = 2)
    public final ThemeElement night;

    public static final class Builder extends Message.Builder<ThemeColorInfo> {
        public ThemeElement dark;
        public ThemeElement day;
        public ThemeElement night;

        public Builder() {
        }

        public Builder(ThemeColorInfo themeColorInfo) {
            super(themeColorInfo);
            if (themeColorInfo == null) {
                return;
            }
            this.day = themeColorInfo.day;
            this.night = themeColorInfo.night;
            this.dark = themeColorInfo.dark;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThemeColorInfo build(boolean z) {
            return new ThemeColorInfo(this, z);
        }
    }

    public ThemeColorInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.day = builder.day;
            this.night = builder.night;
            this.dark = builder.dark;
        } else {
            this.day = builder.day;
            this.night = builder.night;
            this.dark = builder.dark;
        }
    }
}