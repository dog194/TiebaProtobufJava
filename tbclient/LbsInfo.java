package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class LbsInfo extends Message {
    public static final String DEFAULT_LAT = "";
    public static final String DEFAULT_LON = "";
    public static final String DEFAULT_TOWN = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String lat;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String lon;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String town;

    public static final class Builder extends Message.Builder<LbsInfo> {
        public String lat;
        public String lon;
        public String town;

        public Builder() {
        }

        public Builder(LbsInfo lbsInfo) {
            super(lbsInfo);
            if (lbsInfo == null) {
                return;
            }
            this.lat = lbsInfo.lat;
            this.lon = lbsInfo.lon;
            this.town = lbsInfo.town;
        }

        @Override // com.squareup.wire.Message.Builder
        public LbsInfo build(boolean z) {
            return new LbsInfo(this, z);
        }
    }

    public LbsInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.lat;
            if (str == null) {
                this.lat = "";
            } else {
                this.lat = str;
            }
            String str2 = builder.lon;
            if (str2 == null) {
                this.lon = "";
            } else {
                this.lon = str2;
            }
            String str3 = builder.town;
            if (str3 == null) {
                this.town = "";
                return;
            } else {
                this.town = str3;
                return;
            }
        }
        this.lat = builder.lat;
        this.lon = builder.lon;
        this.town = builder.town;
    }
}