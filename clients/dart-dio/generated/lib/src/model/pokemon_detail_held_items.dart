//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_detail_held_by_pokemon_inner_version_details_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_detail_held_items.g.dart';

/// PokemonDetailHeldItems
///
/// Properties:
/// * [item] 
/// * [versionDetails] 
@BuiltValue()
abstract class PokemonDetailHeldItems implements Built<PokemonDetailHeldItems, PokemonDetailHeldItemsBuilder> {
  @BuiltValueField(wireName: r'item')
  AbilityDetailPokemonInnerPokemon get item;

  @BuiltValueField(wireName: r'version_details')
  BuiltList<ItemDetailHeldByPokemonInnerVersionDetailsInner> get versionDetails;

  PokemonDetailHeldItems._();

  factory PokemonDetailHeldItems([void updates(PokemonDetailHeldItemsBuilder b)]) = _$PokemonDetailHeldItems;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonDetailHeldItemsBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonDetailHeldItems> get serializer => _$PokemonDetailHeldItemsSerializer();
}

class _$PokemonDetailHeldItemsSerializer implements PrimitiveSerializer<PokemonDetailHeldItems> {
  @override
  final Iterable<Type> types = const [PokemonDetailHeldItems, _$PokemonDetailHeldItems];

  @override
  final String wireName = r'PokemonDetailHeldItems';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonDetailHeldItems object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(ItemDetailHeldByPokemonInnerVersionDetailsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonDetailHeldItems object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonDetailHeldItemsBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.item.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(ItemDetailHeldByPokemonInnerVersionDetailsInner)]),
          ) as BuiltList<ItemDetailHeldByPokemonInnerVersionDetailsInner>;
          result.versionDetails.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  PokemonDetailHeldItems deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonDetailHeldItemsBuilder();
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

