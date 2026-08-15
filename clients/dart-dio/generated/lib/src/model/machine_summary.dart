//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'machine_summary.g.dart';

/// MachineSummary
///
/// Properties:
/// * [url] 
@BuiltValue()
abstract class MachineSummary implements Built<MachineSummary, MachineSummaryBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  MachineSummary._();

  factory MachineSummary([void updates(MachineSummaryBuilder b)]) = _$MachineSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(MachineSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<MachineSummary> get serializer => _$MachineSummarySerializer();
}

class _$MachineSummarySerializer implements PrimitiveSerializer<MachineSummary> {
  @override
  final Iterable<Type> types = const [MachineSummary, _$MachineSummary];

  @override
  final String wireName = r'MachineSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    MachineSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'url';
    yield serializers.serialize(
      object.url,
      specifiedType: const FullType(String),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    MachineSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required MachineSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
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
  MachineSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = MachineSummaryBuilder();
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

