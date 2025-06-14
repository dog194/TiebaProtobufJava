package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class StarRankIcon extends Message {
    public static final String DEFAULT_ICON_LINK = "";
    public static final String DEFAULT_ICON_PIC_URL = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String icon_link;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon_pic_url;

    public static final class Builder extends Message.Builder<StarRankIcon> {
        public String icon_link;
        public String icon_pic_url;

        public Builder() {
        }

        public Builder(StarRankIcon starRankIcon) {
            super(starRankIcon);
            if (starRankIcon == null) {
                return;
            }
            this.icon_pic_url = starRankIcon.icon_pic_url;
            this.icon_link = starRankIcon.icon_link;
        }

        @Override // com.squareup.wire.Message.Builder
        public StarRankIcon build(boolean z) {
            return new StarRankIcon(this, z);
        }
    }

    public StarRankIcon(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon_pic_url;
            if (str == null) {
                this.icon_pic_url = "";
            } else {
                this.icon_pic_url = str;
            }
            String str2 = builder.icon_link;
            if (str2 == null) {
                this.icon_link = "";
                return;
            } else {
                this.icon_link = str2;
                return;
            }
        }
        this.icon_pic_url = builder.icon_pic_url;
        this.icon_link = builder.icon_link;
    }
}