//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'version_group_summary.g.dart';

/// VersionGroupSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class VersionGroupSummary implements Built<VersionGroupSummary, VersionGroupSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  VersionGroupSummary._();

  factory VersionGroupSummary([void updates(VersionGroupSummaryBuilder b)]) = _$VersionGroupSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(VersionGroupSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<VersionGroupSummary> get serializer => _$VersionGroupSummarySerializer();
}

class _$VersionGroupSummarySerializer implements PrimitiveSerializer<VersionGroupSummary> {
  @override
  final Iterable<Type> types = const [VersionGroupSummary, _$VersionGroupSummary];

  @override
  final String wireName = r'VersionGroupSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    VersionGroupSummary object, {
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
    VersionGroupSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required VersionGroupSummaryBuilder result,
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
  VersionGroupSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = VersionGroupSummaryBuilder();
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

