package protobuf;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class Photo extends Message {
    public static final String DEFAULT_BIGURL = "";
    public static final String DEFAULT_PICID = "";
    public static final String DEFAULT_SMALLURL = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String bigurl;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String picId;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String smallurl;

    public static final class Builder extends Message.Builder<Photo> {
        public String bigurl;
        public String picId;
        public String smallurl;

        public Builder() {
        }

        public Builder(Photo photo) {
            super(photo);
            if (photo == null) {
                return;
            }
            this.smallurl = photo.smallurl;
            this.bigurl = photo.bigurl;
            this.picId = photo.picId;
        }

        @Override // com.squareup.wire.Message.Builder
        public Photo build(boolean z) {
            return new Photo(this, z);
        }
    }

    public Photo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.smallurl;
            if (str == null) {
                this.smallurl = "";
            } else {
                this.smallurl = str;
            }
            String str2 = builder.bigurl;
            if (str2 == null) {
                this.bigurl = "";
            } else {
                this.bigurl = str2;
            }
            String str3 = builder.picId;
            if (str3 == null) {
                this.picId = "";
                return;
            } else {
                this.picId = str3;
                return;
            }
        }
        this.smallurl = builder.smallurl;
        this.bigurl = builder.bigurl;
        this.picId = builder.picId;
    }
}