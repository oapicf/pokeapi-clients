//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pal_park_area_summary.g.dart';

/// PalParkAreaSummary
///
/// Properties:
/// * [name] 
/// * [url] 
@BuiltValue()
abstract class PalParkAreaSummary implements Built<PalParkAreaSummary, PalParkAreaSummaryBuilder> {
  @BuiltValueField(wireName: r'name')
  String get name;

  @BuiltValueField(wireName: r'url')
  String get url;

  PalParkAreaSummary._();

  factory PalParkAreaSummary([void updates(PalParkAreaSummaryBuilder b)]) = _$PalParkAreaSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PalParkAreaSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PalParkAreaSummary> get serializer => _$PalParkAreaSummarySerializer();
}

class _$PalParkAreaSummarySerializer implements PrimitiveSerializer<PalParkAreaSummary> {
  @override
  final Iterable<Type> types = const [PalParkAreaSummary, _$PalParkAreaSummary];

  @override
  final String wireName = r'PalParkAreaSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PalParkAreaSummary object, {
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
    PalParkAreaSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PalParkAreaSummaryBuilder result,
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
  PalParkAreaSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PalParkAreaSummaryBuilder();
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

