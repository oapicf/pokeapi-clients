//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_summary.g.dart';

/// EvolutionChainSummary
///
/// Properties:
/// * [url] 
@BuiltValue()
abstract class EvolutionChainSummary implements Built<EvolutionChainSummary, EvolutionChainSummaryBuilder> {
  @BuiltValueField(wireName: r'url')
  String get url;

  EvolutionChainSummary._();

  factory EvolutionChainSummary([void updates(EvolutionChainSummaryBuilder b)]) = _$EvolutionChainSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainSummary> get serializer => _$EvolutionChainSummarySerializer();
}

class _$EvolutionChainSummarySerializer implements PrimitiveSerializer<EvolutionChainSummary> {
  @override
  final Iterable<Type> types = const [EvolutionChainSummary, _$EvolutionChainSummary];

  @override
  final String wireName = r'EvolutionChainSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainSummary object, {
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
    EvolutionChainSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainSummaryBuilder result,
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
  EvolutionChainSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainSummaryBuilder();
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

