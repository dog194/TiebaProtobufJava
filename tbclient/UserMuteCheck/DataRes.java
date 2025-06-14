package tbclient.UserMuteCheck;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final String DEFAULT_IS_MUTE = "";
    public static final String DEFAULT_MUTE_CONFIRM = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String is_mute;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String mute_confirm;

    public static final class Builder extends Message.Builder<DataRes> {
        public String is_mute;
        public String mute_confirm;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.is_mute = dataRes.is_mute;
            this.mute_confirm = dataRes.mute_confirm;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.is_mute;
            if (str == null) {
                this.is_mute = "";
            } else {
                this.is_mute = str;
            }
            String str2 = builder.mute_confirm;
            if (str2 == null) {
                this.mute_confirm = "";
                return;
            } else {
                this.mute_confirm = str2;
                return;
            }
        }
        this.is_mute = builder.is_mute;
        this.mute_confirm = builder.mute_confirm;
    }
}