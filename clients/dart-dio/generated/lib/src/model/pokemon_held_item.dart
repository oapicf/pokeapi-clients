//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/pokemon_summary.dart';
import 'package:openapi/src/model/pokemon_held_item_version.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_held_item.g.dart';

/// PokemonHeldItem
///
/// Properties:
/// * [pokemon] - The Pokémon that holds this item.
/// * [versionDetails] - The details for the version that this item is held in by the Pokémon.
@BuiltValue()
abstract class PokemonHeldItem implements Built<PokemonHeldItem, PokemonHeldItemBuilder> {
  /// The Pokémon that holds this item.
  @BuiltValueField(wireName: r'pokemon')
  PokemonSummary get pokemon;

  /// The details for the version that this item is held in by the Pokémon.
  @BuiltValueField(wireName: r'version_details')
  BuiltList<PokemonHeldItemVersion> get versionDetails;

  PokemonHeldItem._();

  factory PokemonHeldItem([void updates(PokemonHeldItemBuilder b)]) = _$PokemonHeldItem;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonHeldItemBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonHeldItem> get serializer => _$PokemonHeldItemSerializer();
}

class _$PokemonHeldItemSerializer implements PrimitiveSerializer<PokemonHeldItem> {
  @override
  final Iterable<Type> types = const [PokemonHeldItem, _$PokemonHeldItem];

  @override
  final String wireName = r'PokemonHeldItem';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonHeldItem object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'pokemon';
    yield serializers.serialize(
      object.pokemon,
      specifiedType: const FullType(PokemonSummary),
    );
    yield r'version_details';
    yield serializers.serialize(
      object.versionDetails,
      specifiedType: const FullType(BuiltList, [FullType(PokemonHeldItemVersion)]),
    );
  }

  @override
  Object serialize(
    Serializers serializers,
    PokemonHeldItem object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonHeldItemBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pokemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(PokemonSummary),
          ) as PokemonSummary;
          result.pokemon.replace(valueDes);
          break;
        case r'version_details':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltList, [FullType(PokemonHeldItemVersion)]),
          ) as BuiltList<PokemonHeldItemVersion>;
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
  PokemonHeldItem deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonHeldItemBuilder();
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


