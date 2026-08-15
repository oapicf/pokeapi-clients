//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/evolution_chain_detail_chain.dart';
import 'package:openapi/src/model/item_summary.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'evolution_chain_detail.g.dart';

/// EvolutionChainDetail
///
/// Properties:
/// * [id] 
/// * [babyTriggerItem] 
/// * [chain] 
@BuiltValue()
abstract class EvolutionChainDetail implements Built<EvolutionChainDetail, EvolutionChainDetailBuilder> {
  @BuiltValueField(wireName: r'id')
  int get id;

  @BuiltValueField(wireName: r'baby_trigger_item')
  ItemSummary get babyTriggerItem;

  @BuiltValueField(wireName: r'chain')
  EvolutionChainDetailChain get chain;

  EvolutionChainDetail._();

  factory EvolutionChainDetail([void updates(EvolutionChainDetailBuilder b)]) = _$EvolutionChainDetail;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(EvolutionChainDetailBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<EvolutionChainDetail> get serializer => _$EvolutionChainDetailSerializer();
}

class _$EvolutionChainDetailSerializer implements PrimitiveSerializer<EvolutionChainDetail> {
  @override
  final Iterable<Type> types = const [EvolutionChainDetail, _$EvolutionChainDetail];

  @override
  final String wireName = r'EvolutionChainDetail';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    EvolutionChainDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'id';
    yield serializers.serialize(
      object.id,
      specifiedType: const FullType(int),
    );
    yield r'baby_trigger_item';
    yield serializers.serialize(
      object.babyTriggerItem,
      specifiedType: const FullType(ItemSummary),
    );
    yield r'chain';
    yield serializers.serialize(
      object.chain,
      specifiedType: const FullType(EvolutionChainDetailChain),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    EvolutionChainDetail object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required EvolutionChainDetailBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'id':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(int),
          ) as int;
          result.id = valueDes;
          break;
        case r'baby_trigger_item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemSummary),
          ) as ItemSummary;
          result.babyTriggerItem.replace(valueDes);
          break;
        case r'chain':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(EvolutionChainDetailChain),
          ) as EvolutionChainDetailChain;
          result.chain.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  EvolutionChainDetail deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = EvolutionChainDetailBuilder();
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

