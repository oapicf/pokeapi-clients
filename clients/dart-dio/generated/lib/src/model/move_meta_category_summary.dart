//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'move_meta_category_summary.g.dart';

/// MoveMetaCategorySummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class MoveMetaCategorySummary implements Built<MoveMetaCategorySummary, MoveMetaCategorySummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  MoveMetaCategorySummary._();

  factory MoveMetaCategorySummary([void updates(MoveMetaCategorySummaryBuilder b)]) = _$MoveMetaCategorySummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MoveMetaCategorySummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MoveMetaCategorySummary> get serializer => _$MoveMetaCategorySummarySerializer();
}

class _$MoveMetaCategorySummarySerializer implements PrimitiveSerializer<MoveMetaCategorySummary> {
  @override
  final Iterable<Type> types = const [MoveMetaCategorySummary, _$MoveMetaCategorySummary];

  @override
  final String wireName = r'MoveMetaCategorySummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MoveMetaCategorySummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'name';
    yield serializers.serialize(
      object.name,
      specifiedType: const FullType(String),
    );
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MoveMetaCategorySummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MoveMetaCategorySummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.name = valueDes;
          break;
        case r'url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(String),
          ) as String;
          result.url = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  MoveMetaCategorySummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MoveMetaCategorySummaryBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

