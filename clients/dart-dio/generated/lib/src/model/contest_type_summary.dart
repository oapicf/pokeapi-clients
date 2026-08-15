//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'contest_type_summary.g.dart';

/// ContestTypeSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class ContestTypeSummary implements Built<ContestTypeSummary, ContestTypeSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  ContestTypeSummary._();

  factory ContestTypeSummary([void updates(ContestTypeSummaryBuilder b)]) = _$ContestTypeSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ContestTypeSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ContestTypeSummary> get serializer => _$ContestTypeSummarySerializer();
}

class _$ContestTypeSummarySerializer implements PrimitiveSerializer<ContestTypeSummary> {
  @override
  final Iterable<Type> types = const [ContestTypeSummary, _$ContestTypeSummary];

  @override
  final String wireName = r'ContestTypeSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ContestTypeSummary object, {
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
    ContestTypeSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ContestTypeSummaryBuilder result,
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
  ContestTypeSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ContestTypeSummaryBuilder();
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

