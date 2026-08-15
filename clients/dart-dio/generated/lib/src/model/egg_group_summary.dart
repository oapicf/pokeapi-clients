//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'egg_group_summary.g.dart';

/// EggGroupSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class EggGroupSummary implements Built<EggGroupSummary, EggGroupSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  EggGroupSummary._();

  factory EggGroupSummary([void updates(EggGroupSummaryBuilder b)]) = _$EggGroupSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EggGroupSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EggGroupSummary> get serializer => _$EggGroupSummarySerializer();
}

class _$EggGroupSummarySerializer implements PrimitiveSerializer<EggGroupSummary> {
  @override
  final Iterable<Type> types = const [EggGroupSummary, _$EggGroupSummary];

  @override
  final String wireName = r'EggGroupSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EggGroupSummary object, {
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
    EggGroupSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EggGroupSummaryBuilder result,
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
  EggGroupSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EggGroupSummaryBuilder();
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

