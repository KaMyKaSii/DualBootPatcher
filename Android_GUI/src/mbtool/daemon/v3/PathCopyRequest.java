// automatically generated, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class PathCopyRequest extends Table {
  public static PathCopyRequest getRootAsPathCopyRequest(ByteBuffer _bb) { return getRootAsPathCopyRequest(_bb, new PathCopyRequest()); }
  public static PathCopyRequest getRootAsPathCopyRequest(ByteBuffer _bb, PathCopyRequest obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__init(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public PathCopyRequest __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; return this; }

  public String source() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer sourceAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public String target() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer targetAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }

  public static int createPathCopyRequest(FlatBufferBuilder builder,
      int sourceOffset,
      int targetOffset) {
    builder.startObject(2);
    PathCopyRequest.addTarget(builder, targetOffset);
    PathCopyRequest.addSource(builder, sourceOffset);
    return PathCopyRequest.endPathCopyRequest(builder);
  }

  public static void startPathCopyRequest(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addSource(FlatBufferBuilder builder, int sourceOffset) { builder.addOffset(0, sourceOffset, 0); }
  public static void addTarget(FlatBufferBuilder builder, int targetOffset) { builder.addOffset(1, targetOffset, 0); }
  public static int endPathCopyRequest(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
};

