//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_variable_summary.g.dart';

/// EvolutionVariableSummary
///
/// Properties:
/// * [name] - The name of the referenced resource.
/// * [url] - The URL of the referenced resource.
@BuiltValue()
abstract class EvolutionVariableSummary implements Built<EvolutionVariableSummary, EvolutionVariableSummaryBuilder> {
  /// The name of the referenced resource.
  @BuiltValueField(wireName: r'name')
  String get name;

  /// The URL of the referenced resource.
  @BuiltValueField(wireName: r'url')
  String get url;

  EvolutionVariableSummary._();

  factory EvolutionVariableSummary([void updates(EvolutionVariableSummaryBuilder b)]) = _$EvolutionVariableSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionVariableSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionVariableSummary> get serializer => _$EvolutionVariableSummarySerializer();
}

class _$EvolutionVariableSummarySerializer implements PrimitiveSerializer<EvolutionVariableSummary> {
  @override
  final Iterable<Type> types = const [EvolutionVariableSummary, _$EvolutionVariableSummary];

  @override
  final String wireName = r'EvolutionVariableSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionVariableSummary object, {
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
    EvolutionVariableSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionVariableSummaryBuilder result,
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
  EvolutionVariableSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionVariableSummaryBuilder();
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


