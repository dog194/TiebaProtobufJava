package tbclient.GetForumDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BawuAction extends Message {
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_TYPE = 0;
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer type;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<BawuAction> {
        public String name;
        public Integer type;
        public String url;

        public Builder() {
        }

        public Builder(BawuAction bawuAction) {
            super(bawuAction);
            if (bawuAction == null) {
                return;
            }
            this.name = bawuAction.name;
            this.type = bawuAction.type;
            this.url = bawuAction.url;
        }

        @Override // com.squareup.wire.Message.Builder
        public BawuAction build(boolean z) {
            return new BawuAction(this, z);
        }
    }

    public BawuAction(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.name = builder.name;
        this.type = builder.type;
        this.url = builder.url;
    }
}