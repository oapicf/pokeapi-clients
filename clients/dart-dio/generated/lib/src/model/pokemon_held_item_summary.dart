//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/item_summary.dart';
import 'package:openapi/src/model/pokemon_held_item_version.dart';
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'pokemon_held_item_summary.g.dart';

/// PokemonHeldItemSummary
///
/// Properties:
/// * [item] - The item the referenced Pokémon holds.
/// * [versionDetails] - The details of the different versions in which the item is held.
@BuiltValue()
abstract class PokemonHeldItemSummary implements Built<PokemonHeldItemSummary, PokemonHeldItemSummaryBuilder> {
  /// The item the referenced Pokémon holds.
  @BuiltValueField(wireName: r'item')
  ItemSummary get item;

  /// The details of the different versions in which the item is held.
  @BuiltValueField(wireName: r'version_details')
  BuiltList<PokemonHeldItemVersion> get versionDetails;

  PokemonHeldItemSummary._();

  factory PokemonHeldItemSummary([void updates(PokemonHeldItemSummaryBuilder b)]) = _$PokemonHeldItemSummary;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(PokemonHeldItemSummaryBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<PokemonHeldItemSummary> get serializer => _$PokemonHeldItemSummarySerializer();
}

class _$PokemonHeldItemSummarySerializer implements PrimitiveSerializer<PokemonHeldItemSummary> {
  @override
  final Iterable<Type> types = const [PokemonHeldItemSummary, _$PokemonHeldItemSummary];

  @override
  final String wireName = r'PokemonHeldItemSummary';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    PokemonHeldItemSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    yield r'item';
    yield serializers.serialize(
      object.item,
      specifiedType: const FullType(ItemSummary),
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
    PokemonHeldItemSummary object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required PokemonHeldItemSummaryBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'item':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ItemSummary),
          ) as ItemSummary;
          result.item.replace(valueDes);
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
  PokemonHeldItemSummary deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = PokemonHeldItemSummaryBuilder();
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


