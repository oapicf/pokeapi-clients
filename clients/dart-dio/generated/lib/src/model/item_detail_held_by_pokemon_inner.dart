//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_detail_held_by_pokemon_inner_version_details_inner.dart';
import 'package:built_collection/built_collection.dart';
import 'package:openapi/src/model/ability_detail_pokemon_inner_pokemon.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'item_detail_held_by_pokemon_inner.g.dart';

/// ItemDetailHeldByPokemonInner
///
/// Properties:
/// * [pokemon] 
/// * [versionDetails] 
@BuiltValue()
abstract class ItemDetailHeldByPokemonInner implements Built<ItemDetailHeldByPokemonInner, ItemDetailHeldByPokemonInnerBuilder> {
  @BuiltValueField(wireName: r'pokemon')
  AbilityDetailPokemonInnerPokemon get pokemon;

  @BuiltValueField(wireName: r'version-details')
  BuiltList<ItemDetailHeldByPokemonInnerVersionDetailsInner> get versionDetails;

  ItemDetailHeldByPokemonInner._();

  factory ItemDetailHeldByPokemonInner([void updates(ItemDetailHeldByPokemonInnerBuilder b)]) = _$ItemDetailHeldByPokemonInner;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ItemDetailHeldByPokemonInnerBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ItemDetailHeldByPokemonInner> get serializer => _$ItemDetailHeldByPokemonInnerSerializer();
}

class _$ItemDetailHeldByPokemonInnerSerializer implements PrimitiveSerializer<ItemDetailHeldByPokemonInner> {
  @override
  final Iterable<Type> types = const [ItemDetailHeldByPokemonInner, _$ItemDetailHeldByPokemonInner];

  @override
  final String wireName = r'ItemDetailHeldByPokemonInner';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ItemDetailHeldByPokemonInner object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
    );
    yield r'version-details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(ItemDetailHeldByPokemonInnerVersionDetailsInner)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    ItemDetailHeldByPokemonInner object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ItemDetailHeldByPokemonInnerBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(AbilityDetailPokemonInnerPokemon),
          ) as AbilityDetailPokemonInnerPokemon;
          result.pokemon.replace(valueDes);
          break;
        case r'version-details':
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
  ItemDetailHeldByPokemonInner deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ItemDetailHeldByPokemonInnerBuilder();
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

